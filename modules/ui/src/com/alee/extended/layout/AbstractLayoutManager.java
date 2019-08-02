/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.extended.layout;

import com.alee.api.annotations.NotNull;
import com.alee.api.annotations.Nullable;

import java.awt.*;

/**
 * Abstract {@link LayoutManager2} implementation that hides some less frequently used methods.
 * It also unifies different underlying component addition and removal methods.
 *
 * @author Mikle Garin
 */
public abstract class AbstractLayoutManager implements LayoutManager2
{
    @Override
    public final void addLayoutComponent ( @NotNull final Component component, @Nullable final Object constraints )
    {
        addComponent ( component, constraints );
    }

    @Override
    public final void addLayoutComponent ( @Nullable final String constraints, @NotNull final Component component )
    {
        addComponent ( component, constraints );
    }

    @Override
    public final void removeLayoutComponent ( @NotNull final Component component )
    {
        removeComponent ( component );
    }

    /**
     * Called when component added into container with this layout.
     *
     * @param component   added component
     * @param constraints component constraints
     */
    public void addComponent ( @NotNull final Component component, @Nullable final Object constraints )
    {
        /**
         * Do nothing by default.
         */
    }

    /**
     * Called when component removed from container with this layout.
     *
     * @param component removed component
     */
    public void removeComponent ( @NotNull final Component component )
    {
        /**
         * Do nothing by default.
         */
    }

    @Override
    public abstract void layoutContainer ( @NotNull Container parent );

    @Override
    public abstract Dimension preferredLayoutSize ( @NotNull Container parent );

    @Override
    public Dimension minimumLayoutSize ( @NotNull final Container container )
    {
        return preferredLayoutSize ( container );
    }

    @Override
    public Dimension maximumLayoutSize ( @NotNull final Container container )
    {
        return new Dimension ( Integer.MAX_VALUE, Integer.MAX_VALUE );
    }

    @Override
    public float getLayoutAlignmentX ( @NotNull final Container container )
    {
        return 0.5f;
    }

    @Override
    public float getLayoutAlignmentY ( @NotNull final Container container )
    {
        return 0.5f;
    }

    @Override
    public void invalidateLayout ( @NotNull final Container container )
    {
        /**
         * Do nothing by default.
         */
    }
}